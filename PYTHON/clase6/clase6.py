#clase 6 SENTENCIA IF-ELSE
#condicion = False
'''condicion = 10
if condicion == True:
    print('Condicion Verdadera')
elif condicion == False:
    print('Condicion Falsa')
else:
    print('Condicion no especificada')'''

#conversion de numero a texto
num = int(input('Ingrese un número entre 1 y 3: '))
numTexto = ''
if num == 1:
    numTexto = 'Número uno'
elif num == 2:
    numTexto = 'Número dos'
elif num == 3:
    numTexto = 'Número tres'
else:
    numTexto = 'Número fuera de rango'
print(f'El número ingresado es: {num} - {numTexto}')