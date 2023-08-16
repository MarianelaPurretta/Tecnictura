#Ejercicio 1: Dada la ste tupla, (13,1,8,3,2,5,8) Crear una lista que solo incluya
#Los números menores a 5 e imprima [1,3,2]

tupla = (13, 1 ,8, 3, 2, 5, 8) #Definimos la tupla
lista = [] #Creamos lista vacía
for elementos in tupla: #Recorremos la tupla
    if elementos < 5:
        lista.append(elementos) #Agregamos los elementos a la lista
print(lista) # Mostramos la lista