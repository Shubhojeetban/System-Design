package BookMyShow.dtos;

import BookMyShow.dtos.inventory.TheatreInventory;
import BookMyShow.dtos.models.Theatre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("**** Welcome to Book Your Show ****");
        System.out.println("Please enter the code of your Nearest");
        for (Theatre theatre: TheatreInventory.theatreList) {
            System.out.println(theatre);
        }
        int theatreId = Integer.parseInt(reader.readLine());

        System.out.println("Please select the movie");
        System.out.println();
    }
}