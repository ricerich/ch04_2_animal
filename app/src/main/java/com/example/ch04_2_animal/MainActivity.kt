package com.example.ch04_2_animal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var text2 : TextView
//    lateinit var chkAgree : CheckBox
    lateinit var swAgree : Switch

    lateinit var rGroup1 : RadioGroup
    lateinit var rdoDog : RadioButton
    lateinit var rdoCat : RadioButton
    lateinit var rdoRabbit : RadioButton
//    lateinit var btnOK : Button
    lateinit var imgPet : ImageView

    lateinit var btnFinish : Button
    lateinit var btnInit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "애완동물 사진 보기"

        text1 = findViewById<TextView>(R.id.Text1)
//        chkAgree = findViewById<CheckBox>(R.id.ChkAgree)
        swAgree = findViewById<Switch>(R.id.swAgree);

        text2 = findViewById<TextView>(R.id.Text2)
        rGroup1 = findViewById<RadioGroup>(R.id.Rgroup1)
        rdoDog = findViewById<RadioButton>(R.id.RdoDog)
        rdoCat = findViewById<RadioButton>(R.id.RdoCat)
        rdoRabbit = findViewById<RadioButton>(R.id.RdoRabbit)

//        btnOK = findViewById<Button>(R.id.BtnOK)
        imgPet = findViewById<ImageView>(R.id.ImgPet)

        btnFinish = findViewById<Button>(R.id.btnFinish)
        btnInit = findViewById<Button>(R.id.btnInit)


        // 시작함 체크박스의 체크가 변경되면
//        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
//            // 체크되면 모두 보이도록 설정
////            if (chkAgree.isChecked == true) {
//            if (chkAgree.isChecked) {
//                text2.visibility = android.view.View.VISIBLE
//                rGroup1.visibility = android.view.View.VISIBLE
//                btnOK.visibility = android.view.View.VISIBLE
//                imgPet.visibility = android.view.View.VISIBLE
//            } else {
//                text2.visibility = android.view.View.INVISIBLE
//                rGroup1.visibility = android.view.View.INVISIBLE
//                btnOK.visibility = android.view.View.INVISIBLE
//                imgPet.visibility = android.view.View.INVISIBLE
//            }
//        }
        swAgree.setOnCheckedChangeListener { compoundButton, b ->
            // 체크되면 모두 보이도록 설정
//            if (chkAgree.isChecked == true) {
            if (swAgree.isChecked) {
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
//                btnOK.visibility = android.view.View.VISIBLE
                imgPet.visibility = android.view.View.VISIBLE

                btnFinish.visibility = android.view.View.VISIBLE
                btnInit.visibility = android.view.View.VISIBLE
            } else {
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
//                btnOK.visibility = android.view.View.INVISIBLE
                imgPet.visibility = android.view.View.INVISIBLE

                btnFinish.visibility = android.view.View.INVISIBLE
                btnInit.visibility = android.view.View.INVISIBLE
            }
        }

        rdoDog.setOnClickListener {
            imgPet.setImageResource(R.drawable.dog2)
        }

        rdoCat.setOnClickListener {
            imgPet.setImageResource(R.drawable.cat)
        }

        rdoRabbit.setOnClickListener {
            imgPet.setImageResource(R.drawable.rabbit)
        }
        

        btnFinish.setOnClickListener {
            finish()
        }

        btnInit.setOnClickListener {

            text2.visibility = android.view.View.INVISIBLE
            rGroup1.visibility = android.view.View.INVISIBLE
            imgPet.visibility = android.view.View.INVISIBLE

            btnFinish.visibility = android.view.View.INVISIBLE
            btnInit.visibility = android.view.View.INVISIBLE

//            swAgree.setChecked(false)
            swAgree.isChecked = false
            rGroup1.clearCheck()
            imgPet.setImageResource(0)

        }

        // 선택 완료 버튼을 클릭하면
//        btnOK.setOnClickListener {
//            when (rGroup1.checkedRadioButtonId) {
//                R.id.RdoDog -> imgPet.setImageResource(R.drawable.dog2)
//                R.id.RdoCat -> imgPet.setImageResource(R.drawable.cat)
//                R.id.RdoRabbit -> imgPet.setImageResource(R.drawable.rabbit)
//                else -> Toast.makeText(applicationContext, "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show()
//            }
//        }
    }
}
