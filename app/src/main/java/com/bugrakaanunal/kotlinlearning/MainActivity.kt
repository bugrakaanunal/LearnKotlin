package com.bugrakaanunal.kotlinlearning

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Variables && Constants

        // Integer
        var x = 5
        var y = 4

        println("---------- Integer ------------")


        println(x * y)

        var age = 35
        val result = age / 7 * 5

        println(result)

        //Defining
        val myInteger : Int

        // Initialize
        myInteger = 10

        // Initialize & Devining
        val number : Int = 9
        println(number/2)

        // Long

        var myLong : Long = 100


        // Double & Float

        println("---------- Double & Float------------")

        val pi = 3.14

        println(pi * 3.0)

        val myFloat = 3.14f

        println(myFloat * 2)

        var myAge : Double
        myAge = 23.0
        print(myAge / 2)

        //camelCase
        //snake_case


        // String
        println("---------- String ------------")

        val myString = "bugra Kaan"
        val name = "James"
        val surname = "Hetfield"

        val fullname = name + " " + surname

        println(fullname)

        val larsName : String = "Lars"

        println(myString.capitalize())

        //Boolean
        println("---------- Boolean ------------")

        var myBoolean : Boolean = true
        myBoolean = false

        println(5 < 6)

        //Comversion
        println("--------- Conversion ----------")
        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2)

        //Colletions

        //Arrays

        println("--------- Array ----------")

        val myArray = arrayOf("James","Kirk","Rob","Lars")

        //index
        println(myArray[0])
        myArray[0] = "James Hetfield"
        println(myArray[0])
        println(myArray)
        myArray.set(1,"Bugra")
        println(myArray[1])


        val numberArray = arrayOf(1,2,3.4,5)
        println(numberArray[3])

        val myNewArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("Bugra",5)
        println(mixedArray[0])
        println(mixedArray[1])

        // List - ArrayList

        println("--------- List ----------")

        val myMusician = arrayListOf<String>("James","Kirk")
        myMusician.add("Bagwell")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Bugra")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])


        //Set
        println("--------- Set ----------")

        val myExampleArray = arrayOf(1,2,3,4)

        println("element 1: ${myExampleArray[0]}")
        println("element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,2,3)

        println(mySet.size)

        //For Each

        mySet.forEach { println(it) }
        mySet.forEach { println(it * 5) }

        val myStringSet = HashSet<String>()
        myStringSet.add("Bugra")
        println(myStringSet.size)


        //Map - HashMap

        println("---------- Map -------------")

        //Key - Value

        val fruitArray = arrayOf("Apple", "Banana")
        val caloriesArray = arrayOf(100,150)

        println("${fruitArray[0]} : ${caloriesArray[0]}") //zor yol

        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100) //kolay yol
        fruitCalorieMap.put("Banana",150)

        println(fruitCalorieMap["Apple"])

        val myHashMap = HashMap<String, String>()

        val myNewMap = hashMapOf<String, Int>("A" to 1, "B" to 2, "C" to 3)
        println(myNewMap["C"])

        //Operator (bu konuyu biliyoruz)

        println("----------- Operator ---------")

        var m = 5;
        println(m)
        m = m + 1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7

        println(n > m)


        //Remainder (kalan)
        println(10%3)


        //If control
        println("----------------- If control ----------------------")

        val myNumberAge = 32

        if (myNumberAge < 30) {
            println("myNumberAge < 30")
        } else if (myNumberAge >= 30 && myNumberAge < 40){
            println("40 > myNumberAge > 30")
        } else {
            println("myNumberAge > 40")
        }

        //Switch - When
        println("---------- Switch ------------")
        val day = 3
        var dayString = ""

        when(day) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }
        println(dayString)


        //For Loop

        println("----------------- For Loop ----------------------")


        val myArrayofNumbers = arrayOf(12,15,18,21,24,27,30,33)
        val q = myArrayofNumbers[0] / 3 * 5
        println(q)

        for (num in myArrayofNumbers) {
            val z = num / 3 * 5
            println(z)
        }



        for (i in myArrayofNumbers.indices) {
            val qz = myArrayofNumbers[i] / 3 * 5
            println(qz)
        }


        for (b in 0..9) {
            println(b)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Bugra")
        myStringArrayList.add("Kaan")
        myStringArrayList.add("Unal")

        for (str in myStringArrayList) {
            println(str)
        }

        myStringArrayList.forEach { println(it) }


        //While Loop

        println("----------------- While Loop ----------------------")

        var j = 0

        while (j < 10) {
            println(j)
            j++
        }























    }
}