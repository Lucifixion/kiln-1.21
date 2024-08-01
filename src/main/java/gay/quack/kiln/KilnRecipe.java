package gay.quack.kiln;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.util.Identifier;

public class KilnRecipe extends AbstractCookingRecipe {
    public KilnRecipe(String group, CookingRecipeCategory category, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(KilnMain.KILN_RECIPE_TYPE, group, category, input, output, experience, cookTime);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(KilnMain.KILN_ITEM);
    }

    @Override
    public RecipeSerializer<KilnRecipe> getSerializer() {
        return KilnMain.KILN_RECIPE_SERIALIZER;
    }
}
