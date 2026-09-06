class animal():
    def sound(self):
        print("animal")

class dog(animal):
    def sound(self):
        print("dog")

class birds(animal):
    def sound(self):
        print("birds")  

b1 = birds()
b1.sound()

d1=dog()
d1.sound()