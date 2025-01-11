package com.example.profilemodule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.core.SharedPreferencesManager

class ProfileFragment : Fragment() {
    private val userNameTextView: TextView by lazy { requireView().findViewById(R.id.username_text_view) }
    private val logoutButton: Button by lazy { requireView().findViewById(R.id.logout_button) }
    private val loginActivityLauncher: LoginActivityLauncher by lazy {
        requireActivity() as LoginActivityLauncher
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.profile_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedPreferencesManager = SharedPreferencesManager(requireContext())
        val userName = sharedPreferencesManager.getUserName()

        if (userName != null) {
            userNameTextView.text =
                getString(R.string.profile_username) + getString(R.string.space) + userName
        } else {
            Toast.makeText(
                requireContext(),
                getString(R.string.profile_no_username_found), Toast.LENGTH_SHORT
            ).show()
        }

        logoutButton.setOnClickListener {
            sharedPreferencesManager.removeUserName()
            loginActivityLauncher.startLoginActivity()
        }
    }

    companion object {
        fun getInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }
}