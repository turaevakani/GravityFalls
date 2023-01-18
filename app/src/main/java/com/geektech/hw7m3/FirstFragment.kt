package com.geektech.hw7m3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.geektech.hw7m3.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private  lateinit var binding: FragmentFirstBinding
    private var list = arrayListOf<Character>()
    companion object{
        const val CHARACTER = "CHAR"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = CharacterAdapter(list, this::onClick)
        binding.recyclerView.adapter = adapter
    }

    private fun onClick(position: Int){
        var user = Character(list[position].image, list[position].desc, list[position].name)
        findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(user))
    }

    private fun loadData() {
        list.add(Character("https://i.pinimg.com/originals/3e/67/27/3e6727178a8350088f505b58a7ae951b.gif", "Tourist Trapped", "Dipper Pines"))
        list.add(Character("https://media.tenor.com/zurrlpaQn7cAAAAC/gravity-falls-mabel.gif", "Tourist Trapped", "Mabel Pines"))
        list.add(Character("https://media.tenor.com/0IyraPEslcwAAAAd/gravity-falls-grunkle-stan.gif","Tourist Trapped", "Grunkle Stan"))
        list.add(Character("https://64.media.tumblr.com/f6fb37e3530b34b47b009284543a03d4/tumblr_o19dk8SYlp1uk5pr5o7_500.gif", "Tourist Trapped", "Soos Ramirez"))
        list.add(Character("https://33.media.tumblr.com/7a2fbe526ca2c29f6d1a66b6ec3cce3c/tumblr_n9oxjoGE671rafdwyo2_500.gif", "Tourist Trapped", "Wendy Corduroy"))
        list.add(Character("https://64.media.tumblr.com/4bd9ec487353619c316b940aa9ef84da/tumblr_nuc5phhyeU1r0i0mqo5_500.gifv", "Not What He Seems", "Grunkle Ford"))
        list.add(Character("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/421fc9da-dd69-4d33-b96e-b87ee5000ce3/dcrvcoc-32367887-525f-42a9-971c-90d63ec5a3d2.gif?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzQyMWZjOWRhLWRkNjktNGQzMy1iOTZlLWI4N2VlNTAwMGNlM1wvZGNydmNvYy0zMjM2Nzg4Ny01MjVmLTQyYTktOTcxYy05MGQ2M2VjNWEzZDIuZ2lmIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.LTRFm_Su4i2hykYFcbDid5Bd0CbhUDIFoAVfx5Kn2a0", "Dreamscaperers", "Bill Cipher"))
        list.add(Character("https://thumbs.gfycat.com/BraveDeliciousAntarcticgiantpetrel-size_restricted.gif", "The Time Traveler's Pig", "Waddles"))
        list.add(Character("https://64.media.tumblr.com/e8d8d60aaf9db96ffeda5ac1a405e4c8/tumblr_ncy6obAUIB1rz6w0do1_500.gif", "Tourist Trapped", "Gompers the Goat"))
        list.add(Character("https://i.gifer.com/15go.gif", "The Hand That Rocks the Mabel", "Lil Gideon"))
        list.add(Character("https://64.media.tumblr.com/384fd0a65e76728025e7b9ce848f5ef3/tumblr_ols40zpA1D1uk5pr5o1_540.gifv", "The Legend of the Gobblewonker", "Fiddleford"))
    }


}