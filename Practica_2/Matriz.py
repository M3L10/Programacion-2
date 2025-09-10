class Matriz:
    def __init__(self,mat):
        self.mat = mat

    def __add__(self, o):
        n = len(self.mat)
        m = len(self.mat[0])
        if n == len(o.mat) and m == len(o.mat[0]):
            mat2 = [[0] * m for i in range(n)]
            for i in range(n):
                for j in range(m):
                    mat2[i][j] = self.mat[i][j] + o.mat[i][j]
            return Matriz(mat2)
        else:
            return None

    def __mul__(self, o):
        n = len(self.mat)
        m = len(o.mat[0])
        p = len(o.mat)
        if len(self.mat[0]) == p:
            mat2 = [[0] * m for i in range(n)]
            for i in range(n):
                for j in range(m):
                    for k in range(p):
                        mat2[i][j] += self.mat[i][k] * o.mat[k][j]
            return Matriz(mat2)
        else:
            return None
    def __str__(self):
        cad = ""
        n = len(self.mat)
        m = len(self.mat[0])
        for i in range(n):
            for j in range(m):
                cad = cad + " "+ str(self.mat[i][j])
            cad = cad + "\n"
        return cad
mat1 = [[1,2],[3,4]]
mat2 = [[5,6],[7,8]]
a = Matriz(mat1)
print("Matriz A:")
print(a)
b = Matriz(mat2)
print("Matriz B:")
print(b)
C = a + b
print("Suma A + B:")
print(C)
D = a * b
print("Multiplicación A * B:")
print(D)
