class Processor {
	
	private:
		// Atribut
		string name;
		int price;

	public:
		// Konstruktor
		Processor() {
			name = "";
			price = 0;
		}
		
		// Setter & Getter
		void setName(string name) {
			this->name = name;
		}
		void setPrice(int price) {
			this->price = price;
		}

		string getName() {
			return name;
		}
		int getPrice() {
			return price;
		}

		// Method
		void printProcessor() {
			cout << "- PROCESSOR -" << endl; 
			cout << "Name        : " << name << endl; 
		}

		// Destruktor
		~Processor(){}
};