#Dado el valor de venta de un producto,
#hallar el Impuesto General a las Ventas (IGB, 19%)
#y el precio de venta

#Entrada
print("Valor de venta: ",end="")
valorVenta = float(input())

#Proceso
igv = valorVenta * 0.19
precioVenta = valorVenta + igv

#Salida
print("")
print("IGV:",igv)
print("Precio de venta:",precioVenta)
