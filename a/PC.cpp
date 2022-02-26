class PC {
	
	private:
		// Atribut
		Processor pObj;
		Disk dObj;
		RAM rObj;
		string name;
		int totalPrice;

	public:
		// Konstruktor
		PC(){}
		PC(string name, Processor pObj, Disk dObj, RAM rObj) {
			this->name = name;
			this->pObj = pObj;
			this->dObj = dObj;
			this->rObj = rObj;
			totalPrice = pObj.getPrice() + dObj.getPrice() + rObj.getPrice();
		}
		
		// Setter & Getter
		void setName(string name) {
			this->name = name;
		}
		void setProcessor(Processor pObj) {
			this->pObj = pObj;
		}
		void setDisk(Disk dObj) {
			this->dObj = dObj;
		}
		void setRAM(RAM rObj) {
			this->rObj = rObj;
		}
		void setTotalPrice(Processor pObj, Disk dObj, RAM rObj) {
			totalPrice = pObj.getPrice() + dObj.getPrice() + rObj.getPrice();
		}

		string getName() {
			return name;
		}
		Processor getProcessor() {
			return pObj;
		}
		Disk getDisk() {
			return dObj;
		}
		RAM getRAM() {
			return rObj;
		}
		int getTotalPrice() {
			return totalPrice;
		}

		// Method
		void printPC() {
			cout << "\n===== Prediksi Harga PC " << name << " =====\n" << endl;
			pObj.printProcessor();
			dObj.printDisk();
			rObj.printRAM();
			cout << "-------------------------" << endl;
			cout << "Total Price : " << totalPrice << endl;  
		}

		// Destruktor
		~PC(){}
};