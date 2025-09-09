from MiEntero import MiEntero

num = MiEntero(7)

print("Valor:", num.get_valor())
print("¿Es par?", num.es_par())
print("¿Es impar?", num.es_impar())
print("¿Es primo?", num.es_primo())

print("¿5 es par?", MiEntero.es_par_int(5))
print("¿5 es primo?", MiEntero.es_primo_int(5))

otro = MiEntero(7)
print("¿num = otro?", num.equals_obj(otro))

arr = ['1', '2', '3']
print("Parse char[]:", MiEntero.parse_char_array(arr))
print("Parse String:", MiEntero.parse_string("456"))