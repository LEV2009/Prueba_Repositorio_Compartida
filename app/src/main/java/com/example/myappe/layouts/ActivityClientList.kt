package com.example.myappe.layouts


class ActivityClientList {
    private lateinit var binding: ActivityClientListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClientListBinding.inflate(layoutInflater)
        setContentView(binding.root)





        val clients = listOf(
            Client(101, "Juan", "a@a.com", "1234567"),
            Client(202, "Pedro", "b@b.com", "1234567"),
            Client(303, "Santiago", "c@c.com", "1234567"),
            Client(101, "Juan", "a@a.com", "1234567"),
            Client(202, "Pedro", "b@b.com", "1234567"),
            Client(303, "Santiago", "c@c.com", "1234567"),
            Client(101, "Juan", "a@a.com", "1234567"),
            Client(202, "Pedro", "b@b.com", "1234567"),
            Client(303, "Santiago", "c@c.com", "1234567"),
            Client(101, "Juan", "a@a.com", "1234567"),
            Client(202, "Pedro", "b@b.com", "1234567"),
            Client(303, "Santiago", "c@c.com", "1234567"),
            Client(101, "Juan", "a@a.com", "1234567"),
            Client(202, "Pedro", "b@b.com", "1234567"),
            Client(303, "Santiago", "c@c.com", "1234567")
        )

        binding.clientListContainer.adapter = ClientsAdapter(this, clients)
    }
}
