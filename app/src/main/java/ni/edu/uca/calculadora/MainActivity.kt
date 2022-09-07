package ni.edu.uca.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ni.edu.uca.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)
        iniciar()
    }

    private fun iniciar() {
        binding.btnSuma.setOnClickListener{
            val num1 :Int = binding.etNumero1.text.toString().toInt()
            val num2 :Int = binding.etNumero2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val suma = op.suma()
            binding.tvResultado.setText(suma.toString())
        }

        binding.btnResta.setOnClickListener{
            val num1 :Int = binding.etNumero1.text.toString().toInt()
            val num2 :Int = binding.etNumero2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val restar = op.restar()
            binding.tvResultado.setText(restar.toString())
        }
        binding.btnProducto.setOnClickListener{
            val num1 :Int = binding.etNumero1.text.toString().toInt()
            val num2 :Int = binding.etNumero2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val multiplicar = op.multiplicar()
            binding.tvResultado.setText(multiplicar.toString())
        }

        binding.btnDivision.setOnClickListener{
            val num1 :Int = binding.etNumero1.text.toString().toInt()
            val num2 :Int = binding.etNumero2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val dividir = op.dividir()
            binding.tvResultado.setText(dividir.toString())
        }
    }
}