package in.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
	
	//Field Injection
	@Autowired
	private BookService bs;
	
	public BookController() {
		System.out.println("BookConstroller  :: Constructor");
	}
	
	public void callService() {
		bs.bookingProduct();
	}
	
}
