package Resources;

import Resources.Books.Bible;
import Resources.Books.CookingGuide;
import Resources.Books.Quran;
import Resources.Magazines.BikeMag;
import Resources.Magazines.CarMag;
import Resources.Maps.ManchesterMap;
import Resources.Maps.UkMap;

public class App {

	public static void main(String[] args) {

		CookingGuide jamie = new CookingGuide("Jamie Oliver", "Penguin", "Italian", "2012", 500);
		Bible newBible = new Bible("Jimmy Carr", "The Bible Publisher", "Religious", "Millenial", 10000);
		Quran newQuran = new Quran("Johnny Vegas", "The Quran Publisher", "Religious", "Millenial", 15000);
		BikeMag newBike = new BikeMag("Johnny Smith", "Bike Publisher", "Factual", "Weekly", 200);
		CarMag newCar = new CarMag("Jeremy Clarkson", "Car Publisher", "Factual", "Monthly", 225);
		ManchesterMap newMap = new ManchesterMap("Manchester City Council", "A to Z Maps", "Cartography",
				"Quinquennial", 929);

		UkMap newUMap = new UkMap("Manchester City Council", "A to Z Maps", "Cartography", "Quinquennial", 929);

		System.out.println(jamie);
		System.out.println(newBible);
		System.out.println(newQuran);
		System.out.println(newBike);
		System.out.println(newCar);
		System.out.println(newMap);
		System.out.println(newUMap);

		Library library = new Library();

		library.add(new BikeMag("James May", "Motorbike Publisher", "Factual", "Monthly", 225));
		library.add(new CarMag("Richard Hammond", "Porsche Magazine", "Factual", "Bi Weekly", 100));

		System.out.println(library);
	}
}