package com.main;

import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TxtFileReader implements TxtFileReaderInter{
    // class variable
    private final String path;
    private final String lastChar;

    // Class constructor
    /**
     * Handles reading the txt for specified day.
     * @param day name from the advent 2015 like day1, day2 etc.
     */
    public TxtFileReader(String day, @Nullable String lastChar){
        // Get the full root path
        Path rootPath = Paths.get("");
        String rootRelativePath = rootPath.toAbsolutePath().toString();

        // Full txt path.
        Path txtPath = Paths.get(rootRelativePath,
                "src/com/main/advent2015/", day, "input.txt");
        path = txtPath.toAbsolutePath().toString();

        this.lastChar = lastChar;
    }

    // Class methods
    /**
     * Represents contents from the txt file.
     *
     * @return contents from the txt file
     */
    @Override
    public String contents() {
        StringBuilder content = new StringBuilder();
        File file = new File(this.path);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                content.append(scanner.next().trim());
                if (lastChar != null){
                    content.append(lastChar);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return content.toString();
    }
}
