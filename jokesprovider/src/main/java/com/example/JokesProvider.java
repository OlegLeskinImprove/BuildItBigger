package com.example;

import java.util.Random;

public class JokesProvider {
    private static String[] jokes = new String[]{
            "Just realized a pregnant dog is a dog full of puppies. That's the best.",
            "Why do dogs always race to the door when the doorbell rings? It's hardly ever for them.",
            "I dressed my dog up as a cat for Halloween. Now he won't come when I call him.",
            "I wonder if Superman ever put glasses on Lois Lane's dog and she was like, \"I've never seen this dog before. Is this a new dog?\"",
            "Cats are smarter than dogs. You can't get eight cats to pull a sled through snow.",
            "My dog was my soul mate; we both took naps, we both skipped lunch, we both hated the vacuum…",
            "I hide photos on my computer of me petting animals at the zoo in a file named Fireworks and vacuums so my dog won't find them.",
            "Q: Why aren't dogs good dancers?\nA: Because they have two left feet!",
            "For sale: Eight puppies from a German shepherd and an Alaskan hussy.",
            "This ad in the Bozeman Daily Chronicle was obviously directed toward pet lovers only: \"Free to good home, a loving Jack Russell terror dog.\""};

    public static String requestJoke() {
        return jokes[new Random().nextInt(10)];
    }
}
