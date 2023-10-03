
#Ejecicio 1: Iterar un rango de 0 a 10 e imprimir los numeros divisibles de 3
print('Rango de 0 a 10 con numeros divisibles de 3')
for i in range(11):
    if i % 3 == 0:
        print(i)

#Ejercicio 2: Rango de numeros de 2 a 6 e imprimir
print('Rango de inicio =2 y fin = 6')
rango = range(2, 7)
for i in rango:
    print(i)

#Ejercicio3: Crear rango de 3 a 10 con incremento de 2 en 2
print('Rango valor de inicio = 3 y fin = 10, con incremente de 2 en 2')
for i in range(3, 11, 2): #(valor de inicio, valor de final, iteracion)
    print(i)