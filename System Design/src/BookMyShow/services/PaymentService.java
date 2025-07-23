package BookMyShow.services;

import BookMyShow.models.Show;

public class PaymentService {
    public static double calculatePrice(Show show, int noOfSeats) {
        return show.price * noOfSeats;
    }
}
