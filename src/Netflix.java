
public class Netflix {

	public static void main(String[] args) {
		
		Movie m1 = new Movie("Star Wars VII", 4);
		Movie m2 = new Movie("The Grinch V", 2);
		Movie m3 = new Movie("Fortnite The Movie", 1);
		Movie m4 = new Movie("A Scientists Life", 3);
		Movie m5 = new Movie("The Simpsons Movie II", 5);
		m1.getTicketPrice();
		m2.getTicketPrice();
		m3.getTicketPrice();
		m4.getTicketPrice();
		m5.getTicketPrice();
		NetflixQueue q = new NetflixQueue();
		q.addMovie(m1);
		q.addMovie(m2);
		q.addMovie(m3);
		q.addMovie(m4);
		q.addMovie(m5);
	q.printMovies();
	System.out.println("The best Movie is " + q.getBestMovie());
	System.out.println("The second best Movie is " + q.getSBestMovie());
	
	}
}
