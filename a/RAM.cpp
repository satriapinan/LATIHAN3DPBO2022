class RAM {
	
	private:
		// Atribut
		int capacity;
		int price;

	public:
		// Konstruktor
		RAM() {
			capacity = 0;
			price = 0;
		}
		
		// Setter & Getter
		void setCapacity(int capacity) {
			this->capacity = capacity;
		}
		void setPrice(int price) {
			this->price = price;
		}

		int getCapacity() {
			return capacity;
		}
		int getPrice() {
			return price;
		}

		// Method
		void printRAM() {
			cout << "- RAM -" << endl; 
			cout << "Capacity    : " << capacity << " GB" << endl; 
		}

		// Destruktor
		~RAM(){}
};