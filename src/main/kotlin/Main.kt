/*
5 - Crie um programa número igual a zero. No final, mostre:

- A soma dos números digitados.
- A média deles
- O menor número digitado
- O maior número digitado
 */

fun main(args: Array<String>) {
    var num = 0
    var cont = 0.0
    var cont1 = 0
    var med = 0.0
    var mai = 0
    var men = num

    do{
        print("Digite um número: ")
        num = readLine()!!.toInt()

        if(cont1 == 0) {
            men = num
        }

        if(num != 0) {

        if (num < men){
            men = num
        }
        if (num > mai){
            mai = num
        }

        cont += num
        cont1 ++
        }

    }while (num != 0)

    med = cont/cont1

    println("A soma de todos os números digitados é igual á: $cont")
    println("A média de todos os números digitados é igual á: $med")
    println("O maior número digitado foi: $mai")
    println("O menor número digitado foi: $men")



}