package com.local.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.local.landmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val selectedLandMark = intent.getSerializableExtra("landmark") as Landmark
        binding.nameTextView.text = selectedLandMark.name
        binding.countryTextView.text = selectedLandMark.country
        binding.imageView.setImageResource(selectedLandMark.image)




    }
}