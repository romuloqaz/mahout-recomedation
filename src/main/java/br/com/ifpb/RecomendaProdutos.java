package br.com.ifpb;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

public class RecomendaProdutos {

    public static void main(String[] args) throws TasteException, IOException {
        DataModel produtos = new Recomendador().getModeloProdutos();

        Recommender recommender = new RecomendadorBuilder().buildRecommender(produtos);

        System.out.println("usuário 1");
        List<RecommendedItem> recommendations = recommender.recommend(1, 4);
        for (RecommendedItem recommendation : recommendations) {
            System.out.println(recommendation);
        }
    }
}
