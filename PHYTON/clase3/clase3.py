a: str = "Hola pdesde python"
# :str se usa sólo de refencia para saber el programador el tipo de variable
# type para mostrar el tipo de dato que almacena la variable
print(type(a))
a = 10.3
print(type(a))
a = True
print(type(a))
# tipos int, float,Str, bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola desde python"
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Tipos de cadenas
miGrupoFavorito = "Radiohead ""and Thom Yorke is the best vocalist"
# Símbolo "+" como concatenación
print("Mi grupo favorito es: " + miGrupoFavorito)
miGrupoFavorito = "Radiohead"
caract = " porque con sus letras en clave poética y emocionales manifiestan la tristeza como tal"
print("Mi grupo favorito es: " + miGrupoFavorito, caract)
# Otra forma de imprimir cadenas
numero1 = "7"
numero2 = "2"
print(numero1 + numero2)
# concatena el operador porque es un str
print(int(numero1) + int(numero2))
# ahora sumo porque cambiamos la variable a "int"
# tipos bool
miBooleano = 3 > 2
print(miBooleano)
if miBooleano:
    print("MI RESULTADO ES: VERDADERO")
else:
    print("MI RESULTADO ES: FALSO")
