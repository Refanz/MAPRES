package com.cp15.mapres.ui.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cp15.mapres.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var gMap:GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val mapFragment:SupportMapFragment = supportFragmentManager.findFragmentById(R.id.gMap) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        gMap = googleMap

        val sydney = LatLng(-34.0, 151.0)

        gMap.addMarker(MarkerOptions().position(sydney).title("I am in Sydney"))
        gMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

    }
}