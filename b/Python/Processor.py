class Processor:
	# Konstruktor
	def __init__(self):
		self.__name = ""
		self.__price = 0

	# Setter & Getter
	def setName(self, name):
		self.__name = name

	def setPrice(self, price):
		self.__price = price

	def getName(self):
		return self.__name

	def getPrice(self):
		return self.__price

	# Method
	def printProcessor(self):
		print("- PROCESSOR -")
		print("Name        :", self.__name)