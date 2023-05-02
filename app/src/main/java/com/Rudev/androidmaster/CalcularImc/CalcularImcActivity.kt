package com.Rudev.androidmaster.CalcularImc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.androidmaster.R

class CalcularImcActivity : AppCompatActivity() {

    private var isMascuSelect:Boolean = true
    private var isFemiSelect:Boolean = false

    private lateinit var viewMasculino:CardView
    private lateinit var viewFeminino:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_imc)
        initComponents()
        initListeners()
        initUI()

    }

    /**
     *         Esta função define retorna configuração da view Masculino e feminino
     */

    private fun initComponents(){
        viewMasculino = findViewById(R.id.viewMasculino)
        viewFeminino = findViewById(R.id.viewFeminino)
    }

    /**
     *         Esta função define ação ao click no bottão
     */

    private fun initListeners() {
        viewMasculino.setOnClickListener {
            changeGender()
            setGenderColor() }
        viewFeminino.setOnClickListener {
            changeGender()
            setGenderColor() }

    }

    /**
     *         Esta função define retorna o efeito de click quando falso/verdadeiro
     */

    private fun changeGender(){
        isMascuSelect = !isMascuSelect
        isFemiSelect = !isFemiSelect

    }

    /**
     *         Esta função seleciona cor definida values/colors.xml
     *         - BackgroudColor
     */

    private fun setGenderColor() {
        viewMasculino.setCardBackgroundColor(getBackgroundColor(isMascuSelect))
        viewFeminino.setCardBackgroundColor(getBackgroundColor(isFemiSelect))

    }

    /**
     *         Esta função define condição para que altere a cor do bottão quando verdadeiro ou falso
     */
    private fun getBackgroundColor(isSelectedComponent:Boolean): Int {

        val colorReference = if(isSelectedComponent){
            R.color.background_component_selected
        }else{
            R.color.background_component
        }
        return ContextCompat.getColor(this, colorReference)

    }

    /**
     *         Esta função define a ação do botão quando
     */
    private fun initUI(){
        setGenderColor()
    }

}