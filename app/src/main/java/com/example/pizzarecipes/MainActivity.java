package com.example.pizzarecipes;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza1, "Pizza", "Make your own pizza with a crispy base, mozzarella cheese and a fresh tomato sauce. Add simple toppings like slices of ham and rocket if you like.", "1. Mix together the yeast and sugar with 250ml warm water and leave to sit for 10 mins. Place half the flour in a table-top mixer with a dough hook, pour in the yeast mixture and beat at medium speed for 10 mins (or mix in a bowl, then knead with oiled hands in the bowl for 5-10 mins).\n" +
                "\n" +
                "2. Leave somewhere warm for 10 more mins, then add the remaining flour and oil. Beat or knead to a dough for a further 5 mins. Put in a well-oiled bowl, cover with a cloth and place somewhere warm to double in size – about 1½ hrs.\n" +
                "\n" +
                "3. For the sauce, heat the oil in a pan over a moderate heat. Add the onion and cook for 3 mins, stirring constantly. Add the garlic, 1 tsp sea salt and 1 tsp ground black pepper and cook for 2 mins more. Add the tomatoes and bring to the boil, then reduce the heat and simmer for a good 20 mins, stirring occasionally."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza2, "Pizza Margherita in 4 easy steps", "Even a novice cook can master the art of pizza with our simple step-by-step guide. Bellissimo","1.Make the base: Put the flour into a large bowl, then stir in the yeast and salt. Make a well, pour in 200ml warm water and the olive oil and bring together with a wooden spoon until you have a soft, fairly wet dough. Turn onto a lightly floured surface and knead for 5 mins until smooth. Cover with a tea towel and set aside. You can leave the dough to rise if you like, but it’s not essential for a thin crust.\n" +
                "\n" +
                "2. Make the sauce: Mix the passata, basil and crushed garlic together, then season to taste. Leave to stand at room temperature while you get on with shaping the base.\n" +
                "\n" +
                "3. Roll out the dough: If you’ve let the dough rise, give it a quick knead, then split into two balls. On a floured surface, roll out the dough into large rounds, about 25cm across, using a rolling pin. The dough needs to be very thin as it will rise in the oven. Lift the rounds onto two floured baking sheets.\n" +
                "\n" +
                "4. Top and bake: Heat oven to 240C/fan 220C /gas 8. Put another baking sheet or an upturned baking tray in the oven on the top shelf. Smooth sauce over bases with the back of a spoon. Scatter with cheese and tomatoes, drizzle with olive oil and season. Put one pizza, still on its baking sheet, on top of the preheated sheet or tray. Bake for 8-10 mins until crisp. Serve with a little more olive oil, and basil leaves if using. Repeat step for remaining pizza."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza3, "Superhealthy pizza", "The quantities for this are generous, so if you have any leftovers, pop a wedge of cold pizza into your lunchbox the next day","1. Mix the flours and yeast with a pinch of salt in a food processor fitted with a dough blade. Pour in the water and mix to a soft dough, then work for 1 min. Remove the dough and roll out on a lightly floured surface to a round about 30cm across. Lift onto an oiled baking sheet.\n" +
                "\n" +
                "2. Spread the canned tomatoes over the dough to within 2cm of the edges. Arrange the cherry tomatoes and courgettes over the top, then scatter with the mozzarella. Mix the capers, olives and garlic, then scatter over the top. Drizzle evenly with the oil. Leave to rise for 20 mins. Heat oven to 240C/ fan 220C/gas 9 or the highest setting.\n" +
                "\n" +
                "3. Bake the pizza for 10-12 mins until crisp and golden around the edges. Scatter with the parsley to serve."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza4, "Pitta pizzas", "Little ones will love these fun and super-easy pizza's for lunch or a light supper","1. Heat the grill. Spread each pitta bread with 1 tbsp tomato purée, sprinkle over the mixed herbs, then lay on the tomato slices. Divide the salami between the pittas, sprinkle over the cheese and grill until the cheese is golden and bubbling."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza5, "Florentine pizza", "An easy vegetarian supper or a satisfying weekend lunch","1. To prepare the pizza, preheat the oven to 200C/Gas 6/fan 180C. Put the pizza base on a baking sheet and spread with the sauce.\n" +
                "\n" +
                "2. To cook the spinach, put it in a microwavable bowl, cover with cling film and pierce it a couple of times. Put in the microwave on High (850W) for 2 minutes until wilted (or cook in a covered pan for 2-3 minutes). Drain and spread the spinach over the pizza base, then get the mushrooms out of the jar with a fork and scatter them over the top. Season and sprinkle with half the parmesan. Bake for 10 minutes.\n" +
                "\n" +
                "3. Make four dips in the spinach with the back of a spoon, and crack an egg into each. Sprinkle with the remaining cheese and bake for a further 6- 8 minutes, until the eggs are just set."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza6, "Pizza omelette", "This unusual combination is a real winner and is a great dish to cook with the kids","1. Heat grill to high. Beat the eggs with the oregano and some salt and pepper. Heat the oil in a large ovenproof frying pan, then tip in the eggs. Cook over a low-ish heat for 4 mins, stirring occasionally until the eggs are practically set.\n" +
                "\n" +
                "2. Place under the grill until set and puffed up. Spread the sauce over, scatter with cheese and olives, then grill again until cheese is melted. Cut into wedges and serve with a green salad."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza7, "Pizza sauce", "Our rich tomato pizza sauce is achieved by cooking it over a low heat until thickened and glossy. It's easy to make and is perfect for pizza night...","1. Heat the oil in a saucepan over a low heat, then add the onion along with a generous pinch of salt. Fry gently for 12-15 mins or until the onion has softened and is turning translucent. Add the garlic and fry for a further min. Tip in the tomatoes and purée along with the bay, oregano and sugar. Bring to the boil and lower the heat. Simmer, uncovered, for 30-35 mins or until thickened and reduced. Season. For a really smooth sauce, blitz with a stick blender, otherwise leave as is. \n" +
                "\n" +
                "2. Stir the basil into the sauce. The sauce will cover 4-6 large pizza bases. Keeps well in the fridge for 1 week or stored in a container in the freezer."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza8, "Pizza pie", "Use a ready-made bread mix to make this homemade calzone-style pizza filled with cheese, tomato, pepperoni and peppers","1. Heat oven to 220C/200C fan/gas 7. Make up the pizza base following pack instructions. Knead on a lightly floured surface and divide into 2 balls, 1 slightly bigger than the other. Roll out the bigger ball to about 32cm diameter. Place on a floured baking sheet or pizza tray.\n" +
                "\n" +
                "2. Top the pizza base with the pasta sauce, pepperoni, onion, pepper, mozzarella, oregano, 1 tbsp of the Parmesan and a little black pepper.\n" +
                "\n" +
                "3. Roll the smaller piece of dough to about 28cm diameter and place on top of the pizza filling. Fold the edge of the base over the top, pressing the edges together to seal – use a little water to help stick if you need to. Sprinkle over the remaining Parmesan and bake for 15 mins until puffed and golden."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza9, "Pinwheel pizzas", "Use a packet bread mix to roll up individual pizza buns filled with tomato, basil, mozzarella and pepperoni","1. Oil a 25cm springform tin. Make up the bread mix following pack instructions.\n" +
                "\n" +
                "2. Turn the dough onto a lightly floured surface and roll out to an oblong 35 x 22cm using a rolling pin. Spread the tomato purée over the dough (leaving a border of dough plain all the way round), then scatter with the basil, pepper, pepperoni and mozzarella.\n" +
                "\n" +
                "3. Carefully and firmly roll up from the longest side to make a Swiss roll, then slice evenly into 8 thick pinwheels. Arrange 7 around the edge of the tin and put the eighth in the centre. Cover the tin with cling film and leave in a warm place until well risen. Depending on the heat in the room, this can take up to 1 hr.\n" +
                "\n" +
                "4. Heat oven to 240C/220C fan/gas 7. Remove the cling film, scatter with the cheddar and bake for 12-15 mins until golden."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza10, "Pizza pockets", "These pastries will be a hit with everyone. Make them vegetarian by leaving out the pepperoni and adding a pinch of chilli flakes for a similar spicy kick","1. Heat oven to 200C/180C fan/ gas 6. Heat the oil in a saucepan, add the garlic and oregano, and cook for 1 min until fragrant. Stir in the tomatoes and tomato purée, and cook over a high heat for about 5 mins until thickened.\n" +
                "\n" +
                "2. Unroll the pastry, cut each sheet into quarters, and arrange on two baking trays. Spread a little of the tomato sauce over half of each quarter, keeping a border about 0.5cm around the edge. Top with the cheese, followed by the pepperoni and olives (this keeps the cheese from sticking to the top of the pastry as it melts). Brush the edges with egg and fold over the uncovered half of the pastry, pressing down the edges with a fork to seal. If you have time, leave the pockets in the fridge for at least 15 mins to firm up.\n" +
                "\n" +
                "3. Before baking, make a hole in the top of the pockets and brush with a little more egg. Bake for 20 mins or until golden."));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {


                int imageRecource = recyclerViewItems.get(position).getImageRecource();
                String text1 = recyclerViewItems.get(position).getText1();
                String text3 = recyclerViewItems.get(position).getText3();


                Intent recipe = new Intent(MainActivity.this, Recipe.class);

                recipe.putExtra("imageRecource", imageRecource);
                recipe.putExtra("text1", text1);
                recipe.putExtra("text3", text3);

                startActivity(recipe);

            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(recyclerViewItems);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
