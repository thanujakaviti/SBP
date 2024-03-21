package in.jt;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	public BookService() {
		System.out.println("BookService :: Constructor");
	}
	
	public void bookingProduct() {
		System.err.println("Book has booked :: BookService");
	}
}
