class Disk:
	# Konstruktor
	def __init__(self):
		self.__type = ""
		self.__capacity = 0
		self.__price = 0

	# Setter & Getter
	def setType(self, Type):
		self.__type = Type

	def setCapacity(self, capacity):
		self.__capacity = capacity

	def setPrice(self, price):
		self.__price = price

	def getType(self):
		return self.__type

	def getCapacity(self):
		return self.__capacity

	def getPrice(self):
		return self.__price

	# Method
	def printDisk(self):
		print("- DISK -")
		print("Type        :", self.__type)
		print("Capacity    :", self.__capacity, "GB")