class MiEntero:
    def __init__(self, valor):
        self.valor = valor

    # Devuelve el valor
    def get_valor(self):
        return self.valor

    # Métodos de instancia
    def es_par(self):
        return self.valor % 2 == 0

    def es_impar(self):
        return self.valor % 2 != 0

    def es_primo(self):
        if self.valor <= 1:
            return False
        for i in range(2, self.valor // 2 + 1):
            if self.valor % i == 0:
                return False
        return True

    # Métodos estáticos con int
    @staticmethod
    def es_par_int(n):
        return n % 2 == 0

    @staticmethod
    def es_impar_int(n):
        return n % 2 != 0

    @staticmethod
    def es_primo_int(n):
        if n <= 1:
            return False
        for i in range(2, n // 2 + 1):
            if n % i == 0:
                return False
        return True

    # Métodos estáticos con MiEntero
    @staticmethod
    def es_par_obj(obj):
        return obj.get_valor() % 2 == 0

    @staticmethod
    def es_impar_obj(obj):
        return obj.get_valor() % 2 != 0

    @staticmethod
    def es_primo_obj(obj):
        return obj.es_primo()

    # Métodos equals
    def equals_int(self, n):
        return self.valor == n

    def equals_obj(self, obj):
        return self.valor == obj.get_valor()

    # Métodos parse
    @staticmethod
    def parse_char_array(arr):
        return int("".join(arr))

    @staticmethod
    def parse_string(s):
        return int(s)