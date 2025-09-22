import random

class Juego:
    def __init__(self, numeroDeVidasInicial):
        self.numeroDeVidas = numeroDeVidasInicial
        self.vidasIniciales = numeroDeVidasInicial
        self.record = 0

    def reiniciaPartida(self):
        self.numeroDeVidas = self.vidasIniciales
        print(f"Partida reiniciada. Vidas: {self.numeroDeVidas}")

    def actualizaRecord(self):
        if self.numeroDeVidas > self.record:
            self.record = self.numeroDeVidas
            print(f"¡Nuevo record! record = {self.record}")
        else:
            print(f"No se superó el record actual ({self.record}).")

    def quitaVida(self):
        self.numeroDeVidas -= 1
        print(f"Te quedan {self.numeroDeVidas} vidas.")
        return self.numeroDeVidas > 0


class JuegoAdivinaNumero(Juego):
    def __init__(self, numeroDeVidas):
        super().__init__(numeroDeVidas)
        self.numeroAdivinar = None

    def validaNumero(self, numero):
        return 0 <= numero <= 10

    def juega(self):
        self.reiniciaPartida()
        self.numeroAdivinar = random.randint(0, 10)
        print("Adivina un número entre 0 y 10.")

        while self.numeroDeVidas > 0:
            try:
                intento = int(input("Introduce tu intento: "))
            except ValueError:
                print("Por favor introduce un número entero (0-10).")
                continue

            if not self.validaNumero(intento):
                print("Número inválido. Debe estar entre 0 y 10.")
                continue

            if intento == self.numeroAdivinar:
                print("¡Acertaste!")
                self.actualizaRecord()
                return
            else:
                if not self.quitaVida():
                    print(f"No te quedan vidas. Fin del juego. El número era: {self.numeroAdivinar}")
                    return
                elif intento < self.numeroAdivinar:
                    print("El número es mayor. Intenta otra vez.")
                else:
                    print("El número es menor. Intenta otra vez.")


class JuegoAdivinaPar(JuegoAdivinaNumero):
    def validaNumero(self, numero):
        if 0 <= numero <= 10 and numero % 2 == 0:
            return True
        else:
            print("Error: el número debe ser PAR y entre 0 y 10.")
            return False


class JuegoAdivinaImpar(JuegoAdivinaNumero):
    def validaNumero(self, numero):
        if 0 <= numero <= 10 and numero % 2 == 1:
            return True
        else:
            print("Error: el número debe ser IMPAR y entre 0 y 10.")
            return False


class Aplicacion:
    @staticmethod
    def main():
        juegos = [
            JuegoAdivinaNumero(3),
            JuegoAdivinaPar(3),
            JuegoAdivinaImpar(3)
        ]

        for juego in juegos:
            juego.juega()


if __name__ == "__main__":
    Aplicacion.main()
