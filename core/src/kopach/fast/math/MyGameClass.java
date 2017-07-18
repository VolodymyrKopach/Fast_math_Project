package kopach.fast.math;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGameClass extends Game{

	private AdsController adsController;

	public SpriteBatch spriteBatch;
	public BitmapFont text_vidp, text_pryklad, text_score, text_time, text_restart_t_s, text_restart_t_b_s, text_restart_s, text_restart_b_s;
	public BitmapFont score_textlevel, score_t_b_s, score_b_s;
	public BitmapFont gs1_text_text_score, gs1_text_score, gs1_text_time, gs1_text_text_no_prav_vidp, gs1_text_no_prav_vidp, gs1_text_pryklad, gs1_text_vidp, gs1_text_btn;

	public MyGameClass(AdsController adsController){
		this.adsController = adsController;


       /* if (adsController != null) {
            this.adsController = adsController;
        } else{
            this.adsController = adsController;  // new DummyAdsController();
        }    */

	}

	public void create() {
		spriteBatch = new SpriteBatch();

		bitmapFont();

 		this.setScreen(new GameScreen1(this));
	}

	public void render(){
		super.render();
	}

	public void bitmapFont(){
		text_vidp = new BitmapFont(Gdx.files.internal("bitmapfont/text.fnt"),Gdx.files.internal("bitmapfont/text.png"),false);
		text_pryklad = new BitmapFont(Gdx.files.internal("bitmapfont/text.fnt"),Gdx.files.internal("bitmapfont/text.png"),false);
		text_score = new BitmapFont(Gdx.files.internal("bitmapfont/text.fnt"),Gdx.files.internal("bitmapfont/text.png"),false);
		text_time = new BitmapFont(Gdx.files.internal("bitmapfont/game text time.fnt"),Gdx.files.internal("bitmapfont/game text time.png"),false);
		text_restart_s = new BitmapFont(Gdx.files.internal("bitmapfont/black plus.fnt"),Gdx.files.internal("bitmapfont/black plus.png"),false);
		text_restart_t_s = new BitmapFont(Gdx.files.internal("bitmapfont/black.fnt"),Gdx.files.internal("bitmapfont/black.png"),false);
		text_restart_t_b_s = new BitmapFont(Gdx.files.internal("bitmapfont/black.fnt"),Gdx.files.internal("bitmapfont/black.png"),false);
		text_restart_b_s = new BitmapFont(Gdx.files.internal("bitmapfont/blue normal.fnt"),Gdx.files.internal("bitmapfont/blue normal.png"),false);
		text_vidp.getData().setScale(1.5f, 1.5f);
		text_pryklad.getData().setScale(1.4f, 1.4f);
		text_score.getData().setScale(0.5f, 0.5f);
		text_time.getData().setScale(1.3f, 1.3f);
		text_restart_s.getData().setScale(1, 1);
		text_restart_t_s.getData().setScale(1f, 1f);
		text_restart_t_b_s.getData().setScale(1f, 1f);
		text_restart_b_s.getData().setScale(1.3f, 1.3f);

		score_textlevel = new BitmapFont(Gdx.files.internal("bitmapfont/score level.fnt"),Gdx.files.internal("bitmapfont/score level.png"),false);
		score_t_b_s = new BitmapFont(Gdx.files.internal("bitmapfont/score text.fnt"),Gdx.files.internal("bitmapfont/score text.png"),false);
		score_b_s = new BitmapFont(Gdx.files.internal("bitmapfont/blue bold.fnt"),Gdx.files.internal("bitmapfont/blue bold.png"),false);
		score_textlevel.getData().setScale(1.5f, 1.5f);
		score_t_b_s.getData().setScale(1.5f, 1.5f);
		score_b_s.getData().setScale(1.1f, 1.1f);

		gs1_text_text_score = new BitmapFont(Gdx.files.internal("bitmapfont/black bold 70.fnt"),Gdx.files.internal("bitmapfont/black bold 70.png"),false);
		gs1_text_score = new BitmapFont(Gdx.files.internal("bitmapfont/green bold 70.fnt"),Gdx.files.internal("bitmapfont/green bold 70.png"),false);
		gs1_text_time = new BitmapFont(Gdx.files.internal("bitmapfont/black bold 70.fnt"),Gdx.files.internal("bitmapfont/black bold 70.png"),false);
        gs1_text_text_no_prav_vidp = new BitmapFont(Gdx.files.internal("bitmapfont/black bold 70.fnt"),Gdx.files.internal("bitmapfont/black bold 70.png"),false);
        gs1_text_no_prav_vidp = new BitmapFont(Gdx.files.internal("bitmapfont/red bold 70.fnt"),Gdx.files.internal("bitmapfont/red bold 70.png"),false);
		gs1_text_pryklad = new BitmapFont(Gdx.files.internal("bitmapfont/black bold 70.fnt"),Gdx.files.internal("bitmapfont/black bold 70.png"),false);
		gs1_text_vidp = new BitmapFont(Gdx.files.internal("bitmapfont/black bold 70.fnt"),Gdx.files.internal("bitmapfont/black bold 70.png"),false);
		gs1_text_btn = new BitmapFont(Gdx.files.internal("bitmapfont/white bold 70.fnt"),Gdx.files.internal("bitmapfont/white bold 70.png"),false);
		gs1_text_text_score.getData().setScale(0.5f, 0.5f);
		gs1_text_score.getData().setScale(0.6f, 0.6f);
		gs1_text_time.getData().setScale(0.7f, 0.7f);
		gs1_text_text_no_prav_vidp.getData().setScale(0.5f, 0.5f);
		gs1_text_no_prav_vidp.getData().setScale(0.6f, 0.6f);
		gs1_text_pryklad.getData().setScale(1.4f, 1.4f);
		gs1_text_vidp.getData().setScale(1.5f, 1.5f);
		gs1_text_btn.getData().setScale(0.8f, 0.8f);
	}

	public void bannerAdShow(){
		adsController.showBannerAd();
	}

	public void bannerAdHide(){
		adsController.hideBannerAd();
	}

	public void interstitialAdShow(){
		adsController.showInterstitial(new Runnable() {
			@Override
			public void run() {
				Gdx.app.exit();
			}
		});
	}
}