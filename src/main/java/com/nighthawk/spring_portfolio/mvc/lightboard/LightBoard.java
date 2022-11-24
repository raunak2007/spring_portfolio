package com.nighthawk.spring_portfolio.mvc.lightboard;

import lombok.Data;

@Data  // Annotations to simplify writing code (ie constructors, setters)
public class LightBoard {
    private Light[][] lights;

    public LightBoard(int numRows, int numCols) {
        this.lights = new Light[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                lights[row][col] = new Light();
            }
        }
    }

    public String toString() {
        String outString = "[";
        for (int row = 0; row < lights.length; row++) {
            for (int col = 0; col < lights[row].length; col++) {
                outString += "{" + 
                "\"row\": " + row + "," +
                "\"column\": " + col + "," +
                "\"light\": " + lights[row][col] + 
                "},\n";
            }
        }
        // remove last comma and add square braket
        outString = outString.substring(0,outString.length() - 2) + "]";
		return outString;
    }
    
    static public void main(String[] args) {
        LightBoard lightBoard = new LightBoard(6, 4);
        System.out.println(lightBoard);
    }
}
