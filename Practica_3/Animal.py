from abc import ABC, abstractmethod
class Animal(ABC):
    @abstractmethod
    def sonido(self):
        pass
    @abstractmethod
    def comoSeDesplaza(self): 
        pass
class Perro(Animal):
    def sonido(self):
        return "¡Guau!"
    def comoSeDesplaza(self):
        return "Camina, corre o salta"
class Serpiente(Animal):
    def sonido(self):
        return "¡sssss!"
    def comoSeDesplaza(self):
        return "Se arrastra por el suelo"
class Gato(Animal):
    def sonido(self):
        return "¡Miau!"
    def comoSeDesplaza(self):
        return "Camina y salta con agilidad"
class Ave(Animal):
    def sonido(self):
        return "¡Pío pío!"
    def comoSeDesplaza(self):
        return "Vuela por el aire"
perro = Perro()
serpiente = Serpiente()
gato = Gato()
ave = Ave()
animales = [perro, serpiente, gato, ave]
for a in animales:
    print("Sonido: {}".format(a.sonido()))
    print("Se desplaza: {}".format(a.comoSeDesplaza()))
    print("-----")