package main;

import model.Auction;
import model.AuctionService;
import model.Customer;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Auction auction = new Auction(1,new ArrayList());
//        Customer seller = new Customer("Jan Kowalski");
//        Auction auction = new Auction(1,"Coffee",null,
//                LocalDateTime.now().plusDays(2L),seller,0,null);
//
//        AuctionService auctionService = new AuctionService();
//        auctionService.bid(auction,new Customer("Anna Kowalik"),20);
//
//        auctionService.bid(auction,new Customer("Krzysztof Adamowicz"),25);
//
//        System.out.println("Auction with id: " + auction.getId()+ " finished. Highest bid: " + auction.getHighestBid() + " PLN.");
    }

    Auction taskOne = Auction.AuctionBuilder()
            
}
