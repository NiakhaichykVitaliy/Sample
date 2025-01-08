package com.example.profilemodule

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {
    private val userNameTextView: TextView by lazy { requireView().findViewById(R.id.username_text_view) }
    private val logoutButton: Button by lazy { requireView().findViewById(R.id.logout_button) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.profile_fragment, container, false)
        val sharedPreference: SharedPreferences
        sharedPreference = requireActivity().getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
        val userName = sharedPreference.getString("username", null)

        if (userName != null) {
            userNameTextView.text = userName
        } else {
            Toast.makeText(requireContext(), "No username found", Toast.LENGTH_SHORT).show()
        }

        logoutButton.setOnClickListener {

        }

        return view
    }

    companion object {
        fun getInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }
}