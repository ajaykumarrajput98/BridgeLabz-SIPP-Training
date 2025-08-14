package filemanagementandandhandling;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class DocuVaultManager {
    private static final String STORAGE_DIR = "DocuVaultData";
    private static final String TRASH_DIR = STORAGE_DIR + "/Trash";
    private static final String LOG_FILE = STORAGE_DIR + "/activity.log";

    public static void main(String[] args) {
        ensureDirectories();
        Scanner scanner = new Scanner(System.in);
        uploadFile("user1", "contract.txt", "This is a contract document.");
        readFile("contract.txt");
        appendToFile("contract.txt", "Additional clause added.");
        searchKeyword("clause");
        deleteFile("user1", "contract.txt");
        displayStorageUsage();
    }

    private static void ensureDirectories() {
        new File(STORAGE_DIR).mkdirs();
        new File(TRASH_DIR).mkdirs();
    }

    public static void uploadFile(String username, String fileName, String content) {
        File file = new File(STORAGE_DIR, fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
            logActivity(username, fileName, "UPLOAD");
        } catch (IOException e) {
            System.err.println("Upload failed: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) {
        File file = new File(STORAGE_DIR, fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("Reading file: " + fileName);
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.err.println("Read failed: " + e.getMessage());
        }
    }

    public static void appendToFile(String fileName, String newContent) {
        File file = new File(STORAGE_DIR, fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.newLine();
            writer.write(newContent);
            logActivity("system", fileName, "APPEND");
        } catch (IOException e) {
            System.err.println("Append failed: " + e.getMessage());
        }
    }

    public static void searchKeyword(String keyword) {
        File dir = new File(STORAGE_DIR);
        File[] files = dir.listFiles((d, name) -> !name.equals("activity.log") && !name.equals("Trash"));
        System.out.println("Files containing keyword '" + keyword + "':");
        for (File file : files) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(keyword)) {
                        System.out.println("- " + file.getName());
                        break;
                    }
                }
            } catch (IOException e) {
                System.err.println("Search failed in " + file.getName() + ": " + e.getMessage());
            }
        }
    }

    public static void deleteFile(String username, String fileName) {
        File file = new File(STORAGE_DIR, fileName);
        File trashFile = new File(TRASH_DIR, fileName);
        if (file.exists()) {
            try {
                Files.move(file.toPath(), trashFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                logActivity(username, fileName, "DELETE");
                System.out.println("File moved to Trash: " + fileName);
            } catch (IOException e) {
                System.err.println("Delete failed: " + e.getMessage());
            }
        } else {
            System.out.println("File not found: " + fileName);
        }
    }

    public static void displayStorageUsage() {
        File dir = new File(STORAGE_DIR);
        long totalSize = 0;
        for (File file : dir.listFiles()) {
            if (!file.isDirectory())
                totalSize += file.length();
        }
        System.out.println("Total storage used: " + (totalSize / 1024.0) + " KB");
    }

    private static void logActivity(String username, String fileName, String action) {
        try (BufferedWriter logWriter = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            logWriter.write(username + " | " + fileName + " | " + timestamp + " | " + action);
            logWriter.newLine();
        } catch (IOException e) {
            System.err.println("Logging failed: " + e.getMessage());
        }
    }
}
