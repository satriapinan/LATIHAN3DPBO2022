class RAM:
	# Konstruktor
	def __init__(self):
		self.__capacity = 0
		self.__price = 0

	# Setter & Getter
	def setCapacity(self, capacity):
		self.__capacity = capacity

	def setPrice(self, price):
		self.__price = price

	def getCapacity(self):
		return self.__capacity

	def getPrice(self):
		return self.__price

	# Method
	def printRAM(self):
		print("- RAM -")
		print("Capacity    :", self.__capacity, "GB")