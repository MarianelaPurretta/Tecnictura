'''a: str = "Hola desde python"
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

#Procesamos entrada del usuario

#funcion "input"
resultado = input()
print(resultado)

#Procesar entrada del usuario
# "input"
#resultado = input("Ingrese un numero: ")  #input solo regresa String
#print(resultado)

#conversion de la entrada input a otro tipo de dato
numero1 = int(input("Escriba el primer numero: "))
numero2 = int(input("Escriba el segundo numero: "))
resultado= numero1 + numero2
print("El resultado es: ", resultado)'''
"""
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print("El resultado de la suma es: ", suma)
print(f"El resultado de la suma es: {suma}")
#Interpolacion con "f" incluimos la variable en la cadena
resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")
multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es: {multiplicacion}")
division = operandoA / operandoB
print(f"El resultado de la division es: {division}")
division = operandoA // operandoB  # "//" div int devuelve un entero
print(f"El resultado de la division es: {division}")
modulo = operandoA % operandoB
print(f"El resultado del modulo o residuo de la division es: {modulo} ")
exponente = operandoA ** operandoB
print(f"El resultado del exponente es: {exponente}")
"""
"""
#calcular el area y perimetro de un rectangulo
alto = int(input("Ingrese el alto del rectangulo: "))
ancho = int(input("Ingrese el ancho del rectangulo: "))
area = alto * ancho
perimetro = (alto+ancho)*2
print(f"El perimetro del rectangulo es: {perimetro}")
print(f"El area del rectangulo es: {area}")
"""
"""
miVariable3 = 10
print(miVariable3)
#Operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)
#INCREMENTO CON REASIGNACION
miVariable3 += 1
print(miVariable3)
miVariable3 -= 2
print(miVariable3)
miVariable3 *= 3
print(miVariable3)
miVariable3 //= 2
print(miVariable3)

#OPRADORES DE COMPARACION
d = 4
b = 2
resultado = d == b   # == comparamos
print(resultado)

#OPERADOR != DIFERENTE
d = 4
b = 2
resultado = d != b
print(resultado)

#OPERADOR MAYOR QUE >
d = 4
b = 2
resultado = d > b
print(resultado)

#OPERADOR MENOR QUE <
d = 4
b = 2
resultado = d <= b
print(resultado) """
"""
num = int(input("Ingrese un numero: "))
print(f"El resto de la division es: {num % 2}")
if num % 2 == 0:
    print(f"Su numero {num} es par")
else:
    print(f"Su numero {num} es impar") """

"""edadMayor = 18
edadPersona = int(input("Ingrese su edad: "))
if edadPersona >= edadMayor:
    print(f"Su edad es: {edadPersona} años, y ya es mayor de edad")
else:
    print(f"Su edad es: {edadPersona} años, y aun es menor de edad")"""

#clase 5
#OPERADORES LOGICOS
"""a = True
b = True
resultado = a and b
print(resultado)

#OPERADOR or
resultado = a or b
print(resultado)

#OPERADOR not
resultado = not a
print(resultado)"""

#Ejercico 1: Valor de un rango
"""valor = int(input("Ingrese un número: "))
valMin = 0
valMax = 5
dentroRango = (valor >= valMin and valor <= valMax)
if dentroRango:
    print(f'El valor {valor} esta dentro del rango')
else:
    print(f'El valor {valor} No esta dentro del rango')"""

#Ejercicio2, op nor, op not
"""vacaciones = False
diaDescanso = True
if not (vacaciones or diaDescanso):
    print('Puede asistir al juego')
else:
    print('Debe trabajar')"""

#Ejercicio Rango entre 20 y 30
"""edad= int(input("Ingrese una edad: "))
#veinte = edad >= 20 and edad < 30
#print(veinte)
#treinta = edad >= 30 and edad < 40
#print(treinta)

#if veinte or treinta:
if (edad >= 20 and edad < 30) or (edad >= 30 and edad < 40):
    print("Estas en la gloria! dentro del rango de los (20'0) a (30'0) años")

#    if veinte:
#        print('Estas en la gloria!! entre los (20\'0) años')
#    elif treinta:
#        print('Estas dento del rango!! de los (30\'0) años')

else:
    print('Estas viejo!! no estas entre los (20\'0) a (30\'0) años')

"""

#Ejercicio El mayor de dos números

'''num1 = int(input("Ingrese el primer número: "))
num2 = int(input("Ingrese el segundo número: "))

if num1 > num2:
    print("El número mayor es el primero: ", num1)
else:
    print("El número mayor es el segundo: ", num2)'''

#Ejercicio tienda de libros

'''print('Escriba los datos del libro')
nombre = input('Ingrese el nombre del libro: ')
id = input('Ingrese el ID del libro: ')
precio = input('Ingrese el precio del libro: ')
envioGratis = input('Indicar si tiene envío gratis (True/False): ')
if envioGratis == 'True':
    envioGratis = True
elif envioGratis == 'False':
    envioGratis = False
else:
    envioGratis = 'El valor no corresponde a las opciones, ingrese True o False'
print(f'''
#       NOMBRE: {nombre}
#       ID: {id}
#       PRECIO: ${precio}
#       ENVÍO GRATIS?: {envioGratis}
#''')










