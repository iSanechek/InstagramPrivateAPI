package org.putraxor.instagram


object KEY {
    val SIG_KEY = "5ad7d6f013666cc93c88fc8af940348bd067b68f0dce3c85122a923f4f74b251";
    val SIG_VERSION = "4"
    val APP_VERSION = "10.3.2"
}

object HTTP {
    val TLD = "instagram.com";
    val HOSTNAME = "i.instagram.com";
    val WEB_HOSTNAME = "www.instagram.com";
    val HOST = "https://${HOSTNAME}/";
    val WEBHOST = "https://${WEB_HOSTNAME}/";
    val ENDPOINT = "${HOST}api/v1/";

    val HEADERS = mapOf("X-IG-Connection-Type" to "WIFI",
            "X-IG-Capabilities" to "3ToAAA==",
            "Accept-Language" to "en-US",
            "Host" to HOSTNAME,
            "Accept" to "*/*",
            "Accept-Encoding" to "gzip, deflate, sdch",
            "Connection" to "Close",
            "User-Agent" to "Instagram ${KEY.APP_VERSION} Android (22/6.0.1; 424dpi; 1080x1920; LGE; LG-H779; aka; en_US)")
}

object Routes {
    fun follow(id: String): String {
        return "friendships/create/${id}/"
    }

    fun unfollow(id: String): String {
        return "friendships/destroy/${id}/"
    }

    fun expose(): String {
        return "qe/expose/"
    }

    fun login(): String {
        return "accounts/login/"
    }

    fun logout(): String {
        return "accounts/logout/"
    }

    fun setAccountPrivate(): String {
        return "accounts/set_private/"
    }

    fun setAccountPublic(): String {
        return "accounts/set_public/"
    }

    fun editAccount(): String {
        return "accounts/edit_profile/"
    }

    fun currentAccount(): String {
        return "accounts/current_user/?edit=true"
    }

    fun comment(id: String): String {
        return "media/${id}/comment/"
    }

    fun like(id: String): String {
        return "media/${id}/like/"
    }

    fun unlike(id: String): String {
        return "media/${id}/unlike/"
    }

    fun registrationCreate(): String {
        return "accounts/create/"
    }

    fun registrationCreateValidated(): String {
        return "accounts/create_validated/"
    }

    fun registrationSMSCode(): String {
        return "accounts/send_signup_sms_code/"
    }

    fun registrationValidateSMSCode(): String {
        return "accounts/validate_signup_sms_code/"
    }

    fun checkEmail(): String {
        return "users/check_email/"
    }

    fun checkUsername(): String {
        return "users/check_username/"
    }

    fun usernameSuggestions(): String {
        return "accounts/username_suggestions/"
    }

    fun uploadPhoto(): String {
        return "upload/photo/"
    }

    fun friendshipShow(id: String): String {
        return "friendships/show/${id}/"
    }

    fun friendshipShowMany(): String {
        return "friendships/show_many/"
    }

    fun userInfo(id: String): String {
        return "users/${id}/info/"
    }

    fun userFeed(id: String, max_id: String, rankToken: String): String {
        return "feed/user/${id}/?max_id=${max_id}&rank_token=${rankToken}"
    }

    fun timelineFeed(): String {
        return "feed/timeline/"
    }

    fun tagFeed(tag: String, max_id: String, rankToken: String): String {
        return "feed/tag/${tag}/?max_id=${max_id}&rank_token=${rankToken}"
    }

    fun selfLikedFeed(max_id: String): String {
        return "feed/liked/?max_id=${max_id}"
    }

    fun locationFeed(id: String, max_id: String, rankToken: String): String {
        return "feed/location/${id}/?max_id=${max_id}&rank_token=${rankToken}"
    }

    fun followingFeed(id: String, max_id: String, rankToken: String): String {
        return "friendships/${id}/following/?max_id=${max_id}&rank_token=${rankToken}"
    }

    fun followersFeed(id: String, max_id: String): String {
        return "friendships/${id}/followers/?max_id=${max_id}"
    }

    fun accountsSearch(query: String, rankToken: String): String {
        return "users/search/?is_typehead=true&q=${query}&rank_token=${rankToken}"
    }

    fun hashtagsSearch(query: String, rankToken: String): String {
        return "tags/search/?count=50&q=${query}&rank_token=${rankToken}"
    }

    fun locationsSearch(query: String, rankToken: String): String {
        return "fbsearch/places/?count=50&query=${query}&rank_token=${rankToken}"
    }

    fun changeProfilePicture(): String {
        return "accounts/change_profile_picture/"
    }

    fun mediaConfigure(): String {
        return "media/configure/"
    }

    fun mediaInfo(mediaId: String): String {
        return "media/${mediaId}/info/"
    }

    fun mediaLikes(mediaId: String): String {
        return "media/${mediaId}/likers/"
    }

    fun mediaComments(mediaId: String, max_id: String): String {
        return "media/${mediaId}/comments/?max_id=${max_id}"
    }

    fun mediaDeletePhoto(mediaId: String): String {
        return "media/${mediaId}/delete/?media_type=PHOTO"
    }

    fun qeSync(): String {
        return "qe/sync/"
    }

    fun discoverAyml(): String {
        return "discover/ayml/"
    }

    fun discover(): String {
        return "discover/channels_home/"
    }

    fun v2Inbox(): String {
        return "direct_v2/inbox/?"
    }

    fun threads(threads: String): String {
        return "direct_v2/threads/?user_ids=${threads}"
    }

    fun threadsShow(threadId: String, cursor: String): String {
        return "direct_v2/threads/${threadId}/?cursor=${cursor}"
    }

    fun threadsSeen(threadId: String, itemId: String): String {
        return "direct_v2/threads/${threadId}/items/${itemId}/seen/"
    }

    fun threadsApprove(threadId: String): String {
        return "direct_v2/threads/${threadId}/approve/"
    }

    fun threadsHide(threadId: String): String {
        return "direct_v2/threads/${threadId}/hide/"
    }

    fun threadsPending(max_id: String): String {
        return "direct_v2/pending_inbox/?max_id=${max_id}"
    }

    fun threadsBrodcastText(): String {
        return "direct_v2/threads/broadcast/text/"
    }

    fun threadsBrodcastShare(): String {
        return "direct_v2/threads/broadcast/media_share/?media_type=photo"
    }

    fun threadsBrodcastProfile(): String {
        return "direct_v2/threads/broadcast/profile/"
    }

    fun threadsBrodcastHashtag(): String {
        return "direct_v2/threads/broadcast/hashtag/"
    }

    fun threadsBrodcastPhoto(): String {
        return "direct_v2/threads/broadcast/configure_photo/"
    }

    fun threadsApproveAll(): String {
        return "direct_v2/threads/approve_all/"
    }

    fun threadsRecentRecipients(): String {
        return "direct_share/recent_recipients/"
    }

    fun autocompleteUserList(): String {
        return "friendships/autocomplete_user_list/?version=2&followinfo=True"
    }

    fun megaphoneLog(): String {
        return "megaphone/log/"
    }

    fun block(id: String): String {
        return "friendships/block/${id}/"
    }

    fun unblock(id: String): String {
        return "friendships/unblock/${id}/"
    }

    fun recetActivity():String{
        return "news/inbox/?"
    }
}

object EXPERIMENT {
    val EXPERIMENTS = "ig_android_ad_holdout_16m5_universe,ig_android_progressive_jpeg,ig_creation_growth_holdout,ig_android_oppo_app_badging,ig_android_ad_remove_username_from_caption_universe,ig_android_enable_share_to_whatsapp,ig_android_direct_drawing_in_quick_cam_universe,ig_android_ad_always_send_ad_attribution_id_universe,ig_android_universe_video_production,ig_android_direct_plus_button,ig_android_ads_heatmap_overlay_universe,ig_android_http_stack_experiment_2016,ig_android_infinite_scrolling,ig_fbns_blocked,ig_android_post_auto_retry_v7_21,ig_fbns_push,ig_android_video_playback_bandwidth_threshold,ig_android_direct_link_preview,ig_android_direct_typing_indicator,ig_android_preview_capture,ig_android_feed_pill,ig_android_profile_link_iab,ig_android_story_caption,ig_android_network_cancellation,ig_android_histogram_reporter,ig_android_anrwatchdog,ig_android_search_client_matching,ig_android_follow_request_text_buttons,ig_android_feed_zoom,ig_android_drafts_universe,ig_android_disable_comment,ig_android_user_detail_endpoint,ig_android_os_version_blocking,ig_android_blocked_list,ig_android_event_creation,ig_android_high_res_upload_2,ig_android_2fac,ig_android_mark_reel_seen_on_Swipe_forward,ig_android_comment_redesign,ig_android_ad_sponsored_label_universe,ig_android_mentions_dismiss_rule,ig_android_disable_chroma_subsampling,ig_android_share_spinner,ig_android_video_reuse_surface,ig_explore_v3_android_universe,ig_android_media_favorites,ig_android_nux_holdout,ig_android_insta_video_universe,ig_android_search_null_state,ig_android_universe_reel_video_production,liger_instagram_android_univ,ig_android_direct_emoji_picker,ig_feed_holdout_universe,ig_android_direct_send_auto_retry_universe,ig_android_samsung_app_badging,ig_android_disk_usage,ig_android_business_promotion,ig_android_direct_swipe_to_inbox,ig_android_feed_reshare_button_nux,ig_android_react_native_boost_post,ig_android_boomerang_feed_attribution,ig_fbns_shared,ig_fbns_dump_ids,ig_android_react_native_universe,ig_show_promote_button_in_feed,ig_android_ad_metadata_behavior_universe,ig_android_video_loopcount_int,ig_android_inline_gallery_backoff_hours_universe,ig_android_rendering_controls,ig_android_profile_photo_as_media,ig_android_async_stack_image_cache,ig_video_max_duration_qe_preuniverse,ig_video_copyright_whitelist,ig_android_render_stories_with_content_override,ig_android_ad_intent_to_highlight_universe,ig_android_swipe_navigation_x_angle_universe,ig_android_disable_comment_public_test,ig_android_profile,ig_android_direct_blue_tab,ig_android_enable_share_to_messenger,ig_android_fetch_reel_tray_on_resume_universe,ig_android_promote_again,ig_feed_event_landing_page_channel,ig_ranking_following,ig_android_pending_request_search_bar,ig_android_feed_ufi_redesign,ig_android_pending_edits_dialog_universe,ig_android_business_conversion_flow_universe,ig_android_show_your_story_when_empty_universe,ig_android_ad_drop_cookie_early,ig_android_app_start_config,ig_android_fix_ise_two_phase,ig_android_ppage_toggle_universe,ig_android_pbia_normal_weight_universe,ig_android_profanity_filter,ig_ios_su_activity_feed,ig_android_search,ig_android_boomerang_entry,ig_android_mute_story,ig_android_inline_gallery_universe,ig_android_ad_remove_one_tap_indicator_universe,ig_android_view_count_decouple_likes_universe,ig_android_contact_button_redesign_v2,ig_android_periodic_analytics_upload_v2,ig_android_send_direct_typing_indicator,ig_android_ad_holdout_16h2m1_universe,ig_android_react_native_comment_moderation_settings,ig_video_use_sve_universe,ig_android_inline_gallery_no_backoff_on_launch_universe,ig_android_immersive_viewer,ig_android_discover_people_icon,ig_android_profile_follow_back_button,is_android_feed_seen_state,ig_android_dense_feed_unit_cards,ig_android_drafts_video_universe,ig_android_exoplayer,ig_android_add_to_last_post,ig_android_ad_remove_cta_chevron_universe,ig_android_ad_comment_cta_universe,ig_android_search_event_icon,ig_android_channels_home,ig_android_feed,ig_android_dv2_realtime_private_share,ig_android_non_square_first,ig_android_video_interleaved_v2,ig_android_video_cache_policy,ig_android_react_native_universe_kill_switch,ig_android_video_captions_universe,ig_android_follow_search_bar,ig_android_last_edits,ig_android_two_step_capture_flow,ig_android_video_download_logging,ig_android_share_link_to_whatsapp,ig_android_facebook_twitter_profile_photos,ig_android_swipeable_filters_blacklist,ig_android_ad_pbia_profile_tap_universe,ig_android_use_software_layer_for_kc_drawing_universe,ig_android_react_native_ota,ig_android_direct_mutually_exclusive_experiment_universe,ig_android_following_follower_social_context";
    val LOGIN_EXPERIMENTS = "ig_android_reg_login_btn_active_state,ig_android_ci_opt_in_at_reg,ig_android_one_click_in_old_flow,ig_android_merge_fb_and_ci_friends_page,ig_android_non_fb_sso,ig_android_mandatory_full_name,ig_android_reg_enable_login_password_btn,ig_android_reg_phone_email_active_state,ig_android_analytics_data_loss,ig_fbns_blocked,ig_android_contact_point_triage,ig_android_reg_next_btn_active_state,ig_android_prefill_phone_number,ig_android_show_fb_social_context_in_nux,ig_android_one_tap_login_upsell,ig_fbns_push,ig_android_phoneid_sync_interval";
}