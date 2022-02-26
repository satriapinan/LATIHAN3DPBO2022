from Processor import Processor
from Disk import Disk
from RAM import RAM

class PC:
	# Konstruktor
	def __init__(self, name, pObj = Processor, dObj = Disk, rObj = RAM):
		self.__name = name
		self.__pObj = pObj
		self.__dObj = dObj
		self.__rObj = rObj
		self.__totalPrice = pObj.getPrice() + dObj.getPrice() + rObj.getPrice()

	# Setter & Getter
	def setName(self, name):
		self.__name = name

	def setProcessor(self, pObj = Processor):
		self.__pObj = pObj

	def setDisk(self, dObj = Disk):
		self.__dObj = dObj

	def setRAM(self, rObj = RAM):
		self.__rObj = rObj

	def setTotalPrice(self, pObj = Processor, dObj = Disk, rObj = RAM):
		self.__totalPrice = pObj.getPrice() + dObj.getPrice() + rObj.getPrice()
		
	def getName(self):
		return self.__name

	def getProcessor(self):
		return self.__pObj

	def getDisk(self):
		return self.__dObj

	def getRAM(self):
		return self.__rObj

	def getTotalPrice(self):
		return self.__totalPrice

	# Method
	def printPC(self):
		print("\n===== Prediksi Harga PC", self.__name, "=====\n")
		self.__pObj.printProcessor()
		self.__dObj.printDisk()
		self.__rObj.printRAM()
		print("-------------------------")
		print("Total Price : ", self.__totalPrice)