package com.example.android.bluetoothclassictest

import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.android.bluetoothclassictest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()

        with(binding){
            if(bluetoothAdapter == null){
                turnOnBtn.isEnabled = false
                turnOffBtn.isEnabled = false
                pairedDeviceBtn.isEnabled = false
                searchDeviceBtn.isEnabled = false
                statusText.text = "Status : not supported"
            } else {
                turnOnBtn.setOnClickListener {

                }
            }
        }
    }
}