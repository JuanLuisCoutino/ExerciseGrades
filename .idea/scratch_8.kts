import java.lang.Exception
import javax.swing.JOptionPane

var contador = 0
var calificacion = 0.0
var suma = 0.0
var promedio = 0.0
var texto : String? = null

try {
    do {
        texto = JOptionPane.showInputDialog("Dame tu calificacion en el semestre ${contador + 1}")
        if (texto != null) {
            calificacion = texto!!.toDouble()
            suma += calificacion
            contador++
        }
    } while (texto != null)
    if (contador > 0) {
        promedio = suma / contador
        JOptionPane.showInputDialog(null, "Tu promedio es : ${promedio}")
    } else {
        JOptionPane.showInputDialog(null, "No ingresaste bien los datos, intentalo de nuevo")
    }
}
catch (e:Exception){
    println("Tu error esta en ${e}")
}

