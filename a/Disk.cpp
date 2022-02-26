class Disk {
	
	private:
		// Atribut
		string type;
		int capacity;
		int price;

	public:
		// Konstruktor
		Disk() {
			type = "";
			capacity = 0;
			price = 0;
		}
		
		// Setter & Getter
		void setType(string type) {
			this->type = type;
		}
		void setCapacity(int capacity) {
			this->capacity = capacity;
		}
		void setPrice(int price) {
			this->price = price;
		}

		string getType() {
			return type;
		}
		int getCapacity() {
			return capacity;
		}
		int getPrice() {
			return price;
		}

		// Method
		void printDisk() {
			cout << "- DISK -" << endl; 
			cout << "Type        : " << type << endl; 
			cout << "Capacity    : " << capacity << " GB" << endl; 
		}

		// Destruktor
		~Disk(){}
};