package com.example.kotlintraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintraining.adapter.StudentAdapter
import com.example.kotlintraining.model.Student

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO [1] Getting the RecyclerView by its ID
        val recyclerView = findViewById<RecyclerView>(R.id.rv_student)

        // TODO [2] Create LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // TODO [3] Create an ArrayList to hold the Data
        val studentList = ArrayList<Student>()

        // TODO [4] Add student images to the drawable file
        // TODO [5] Insert Data to the ArrayList
        studentList.add(Student("Abdullah", R.drawable.ic_android))
        studentList.add(Student("Abdullah", R.drawable.ic_android))
        studentList.add(Student("Abdullah", R.drawable.ic_android))
        studentList.add(Student("Abdullah", R.drawable.ic_android))
        studentList.add(Student("Abdullah", R.drawable.ic_android))
        studentList.add(Student("Abdullah", R.drawable.ic_android))

        // TODO [6] Create an adapter reference
        val adapter = StudentAdapter(studentList)
        // TODO [7] Setting up the Adapter with the RecyclerView
        recyclerView.adapter = adapter


    }

}