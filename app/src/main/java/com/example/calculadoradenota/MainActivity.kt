package com.example.calculadoradenota
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * add função para calcular a nota do aluno
        * caso a nota for maior que 7 sera apresentando em tela aprovado
        * */

        btn_calcular.setOnClickListener {
            var nota1 =  input_nota_um.text.toString()
            var nota2 =  input_nota_dois.text.toString()
            var nota3 =  input_nota_tres.text.toString()

            val media = ((nota1.toInt() + nota2.toInt() + nota3.toInt())/3)

            if (media >= 7){
                resultado.visibility = TextView.VISIBLE
                resultado.text = "apravado"
            }else{
                resultado.visibility = TextView.VISIBLE
                resultado.text = "repravado"
            }
        }

        /*
        * Add função para limpar os campos e iniciar novamente os calculos
        * */
        btn_limpar.setOnClickListener {
            resultado.visibility = TextView.INVISIBLE
            input_nota_um.setText("")
            input_nota_dois.setText("")
            input_nota_tres.setText("")
        }
    }
}
