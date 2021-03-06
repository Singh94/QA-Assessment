package qa_cinema.movies;

public class movies {
	public enum Movies {
		M0(null), 
		M1("Blade Runner 2049"),
		M2("Star Wars: The Last Jedi"),
		M3("IT"),
		M4("Justice League"),
		M5("Kingsman: The Golden Circle"),
		M6("Professor Marston and the Wonder Woman"),
		M7("The Dark Tower"),
		M8("Thor: Ragnarok"),
		M9("The Snowman"),
		M10("War for the Planet of the Apes");
		
		private String label;
		
		private Movies(String movie) {
			this.label = movie;
		}
		
		public String toString() {
			return label;
		}
	}
}