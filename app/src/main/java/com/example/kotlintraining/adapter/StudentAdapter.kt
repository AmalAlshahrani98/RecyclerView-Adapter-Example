package com.example.kotlintraining.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintraining.R
import com.example.kotlintraining.model.Student
// TODO [1] send list of data
class StudentAdapter(val studentList : List<Student>) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    // view holder class
    class StudentViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView){
        // TODO [4] connect views in layout with sent data
       val studentDetailsTv : TextView
       val studentImageTv : ImageView

       init {
           studentDetailsTv = itemView.findViewById(R.id.student_details)
           studentImageTv = itemView.findViewById(R.id.student_img)
       }
    }

    // TODO [3] Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student, parent, false)

        return StudentViewHolder(view)
    }
    // TODO [5] Connect item views to data source
    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.studentDetailsTv.text = studentList[position].name
        holder.studentImageTv.setImageResource(R.drawable.ic_android)
    }

    // TODO [2] send number of items in the list
    override fun getItemCount() = studentList.size
}