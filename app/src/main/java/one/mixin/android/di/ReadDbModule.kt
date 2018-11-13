package one.mixin.android.di

import android.app.Application
import dagger.Module
import dagger.Provides
import one.mixin.android.db.MixinDatabase
import one.mixin.android.di.type.DatabaseCategory
import one.mixin.android.di.type.DatabaseCategoryEnum
import javax.inject.Singleton

@Module
internal class ReadDbModule {

    @Singleton
    @Provides
    @DatabaseCategory(DatabaseCategoryEnum.READ)
    fun provideReadDb(app: Application) = MixinDatabase.getReadDatabase(app)

    @Singleton
    @Provides
    @DatabaseCategory(DatabaseCategoryEnum.READ)
    fun provideMessageDao(@DatabaseCategory(DatabaseCategoryEnum.READ) db: MixinDatabase) = db.messageDao()
}
