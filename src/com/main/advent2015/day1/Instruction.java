package com.main.advent2015.day1;

public enum Instruction {
    OPEN(1), CLOSE(-1);

    final int instructionValue;

    Instruction(int instructionValue) {
        this.instructionValue = instructionValue;
    }

    /**
     * Map the character `(` to instruction Open or `)` to Close instruction.
     * @param parentheses: A character containing parentheses.
     * @return Instruction OPEN or CLOSE.
     */
    public static Instruction mapToInstruction(char parentheses) throws IllegalArgumentException{
        return switch (parentheses) {
            case '(' -> OPEN;
            case ')' -> CLOSE;
            default -> throw new IllegalArgumentException("Invalid argument expected `(` or `)`");
        };
    }

    /**
     * Map instruction to integer value.
     * @param instruction: Instruction to map to value
     * @return integer value of instruction
     */
    public static int mapToValue(Instruction instruction){
        return instruction.instructionValue;
    }
}
