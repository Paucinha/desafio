let array = []
function exibeNumero(entrada) {
    for (let i = 0; i < entrada; i++) {
        array.push(" ".repeat(entrada - i - 1) + "*".repeat(i + 1))
        
    }
    for (const entrada of array) {
        console.log(entrada)
    }
}
exibeNumero(6)